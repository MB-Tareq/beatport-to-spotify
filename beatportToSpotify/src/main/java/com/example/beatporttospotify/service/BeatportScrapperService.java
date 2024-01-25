package com.example.beatporttospotify.service;

import com.example.beatporttospotify.model.BeatportGenre;
import com.example.beatporttospotify.model.BeatportSong;
import org.jsoup.nodes.Document;

import java.util.List;

public interface BeatportScrapperService {
    public Document getHTML(String url);
    public List<BeatportGenre> getGenres();
    public List<BeatportSong> getTop100(String genre);
}
