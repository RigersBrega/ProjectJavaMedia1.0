package com.school.media;

public class Mediamain {
    public static void main(String[] args) {
        
        Mediateke music1 = new MusicCd("music1.mp3", "MP3", 6, "Gunther", "TeenyWeeny", "00:03:34", 500, "None", "Pop");
        Mediateke video1 = new VideoDvd("Video1.mp4", "MP4", 240, "Tim", "Enjoying Nature", "00:21:51", 720, "Recording");
        Mediateke ebook1 = new Ebook("ebook1.pdf", "PDF", 240, "Tim", "GloryBook", 57, "Drama");

        Mediateke media[] = {music1, video1, ebook1};

        System.out.println(media[0]);

        System.out.println("\n\n");

        System.out.println(media[1]);

        System.out.println("\n\n");

        System.out.println(media[2]);

        ebook1.openFile();

    }
}
