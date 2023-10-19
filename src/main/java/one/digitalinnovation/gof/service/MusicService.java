package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Music;
import one.digitalinnovation.gof.model.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public void deletarMusica(Long id) {
    }

    public void atualizar(Long id, Music musica) {
    }

    public void inserirMusica(Music musica) {
    }

    public Music buscarMusicaPorId(Long id) {
        return null;
    }

    public Iterable<Music> buscarTodasAsMusicas() {
        return null;
    }
}

