package dev.oyspot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleController {

    public record Playlist (String name, int numTracks, String imageUrl, boolean isPublic, String creatorName) {}

    @GetMapping("/playlists")
    public List<Playlist> getPlaylists() {
        List<Playlist> playlists = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Playlist playlist = new Playlist("Playlist " + (i + 1), (i + 1) * 7, "https://loremflickr.com/cache/resized/65535_49259751096_8cd762d9fc_n_320_240_g.jpg", i % 2 == 0, "John Doe");
            playlists.add(playlist);
        }
        return playlists;
    }
}
