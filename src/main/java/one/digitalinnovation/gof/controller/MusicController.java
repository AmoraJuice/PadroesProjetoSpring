package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Music;
import one.digitalinnovation.gof.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Musicas")
public class MusicController {

    @Autowired
    public MusicService musicService;

    @GetMapping
    public ResponseEntity<Iterable<Music>> buscarTodasAsMusicas() {
        return ResponseEntity.ok(musicService.buscarTodasAsMusicas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Music> buscarMusicaPorId(@PathVariable Long id) {
        return ResponseEntity.ok(musicService.buscarMusicaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Music> inserirMusica(@RequestBody Music musica) {
        musicService.inserirMusica(musica);
        return ResponseEntity.ok(musica);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Music> atualizarMusica(@PathVariable Long id, @RequestBody Music musica) {
        musicService.atualizar(id, musica);
        return ResponseEntity.ok(musica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMusica(@PathVariable Long id) {
        musicService.deletarMusica(id);
        return ResponseEntity.ok().build();
    }
}
