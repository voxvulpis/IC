package br.unesp.controller;

// import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import br.unesp.entity.Fisica;
import br.unesp.repository.FisicaRepository;
import io.micronaut.http.HttpResponse;
// import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
// import io.micronaut.http.annotation.Get;
// import io.micronaut.http.annotation.Put;


@Controller("/afisica")
public class FisicaController {
    protected final FisicaRepository fisicaRepository;

    public FisicaController(FisicaRepository fisicaRepository) {
        this.fisicaRepository = fisicaRepository;
    }

    @Post("/{entity}")
    public HttpResponse<Fisica> save(Fisica entity) {
        fisicaRepository.save(entity);
        return HttpResponse.ok();
    }

    // @Get("/{id}")
    // public Fisica findByCpf(Long id) {
    //     Fisica insertedEntity = null;

    //     if (fisicaRepository != null) {
    //         insertedEntity = fisicaRepository.findById(id).get();
    //     }

    //     return insertedEntity;
    // }

    @Get("/{id}")
    public HttpResponse<Fisica> findById(@PathVariable Long id) {
        return fisicaRepository.findById(id)
                    .map(HttpResponse::ok)
                    .orElseGet(HttpResponse::notFound);
    }

    @Delete("/{id}")
    public void delete(Long id) {

        if (fisicaRepository != null) {
            fisicaRepository.delete(fisicaRepository.findById(id).get());
        }
    }

    @Put("/{entity}")
    public Fisica update(Fisica entity) {

        Fisica persistedEntity = null;

        if (fisicaRepository != null) {
            persistedEntity = fisicaRepository.save(entity);
        }

        return persistedEntity;
    }

    @Get("/list")
    public List<Fisica> findAll() {
        List<Fisica> list = null;

        if (fisicaRepository != null) {
            list = new ArrayList<>();
            list = fisicaRepository.findAll();
        }

        return list;
    }
}
