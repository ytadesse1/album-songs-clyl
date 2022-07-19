package org.wcci.apimastery;
import org.wcci.apimastery.Model.Rating;
import org.wcci.apimastery.Model.Song;
import org.springframework.boot.CommandLineRunner;
import org.wcci.apimastery.Model.Album;
import org.wcci.apimastery.Repository.AlbumRepository;
import org.wcci.apimastery.Repository.RatingRepository;
import org.wcci.apimastery.Repository.SongRepository;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner{
    private AlbumRepository albumRepo;
    private SongRepository songRepo;
    private RatingRepository ratingRepo;

    public Populator(AlbumRepository albumRepo, SongRepository songRepo, RatingRepository ratingRepo) {
        this.albumRepo = albumRepo;
        this.songRepo = songRepo;
        this.ratingRepo = ratingRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Album graduation = new Album("Graduation", "/images/albumCover.jpg", "Def Jam Roc-A-Fella");
        Album whiteAlbum = new Album("The White Album", "/images/albumCover.jpg", "Apple");
        Album incredible = new Album("The Incredible True Story", "/images/albumCover.jpg", "Def Jam");
        Album blackOnBothSides = new Album("Black on Both Sides", "/images/albumCover.jpg", "Rawkus");

        albumRepo.save(graduation);
        albumRepo.save(whiteAlbum);
        albumRepo.save(incredible);
        albumRepo.save(blackOnBothSides);

        Song goodMorning = new Song("Good Morning", 195, graduation);
        Song barryBonds = new Song("Barry Bonds", 243, graduation);
        Song champion = new Song("Champion", 168, graduation);
        Song goodLife = new Song("Good Life", 207, graduation);

        Song blackBird = new Song("Black Bird", 138, whiteAlbum);
        Song rockyRacoon = new Song("Rocky Raccoon", 2012, whiteAlbum);
        Song ObLaDi = new Song("Ob-La-Di, Ob-La-Da", 189, whiteAlbum);
        Song ussr = new Song("Back in the U.S.S.R.", 163, whiteAlbum);

        Song fadeAway = new Song("Fade Away", 288, incredible);
        Song runIt = new Song("Run It", 201, incredible);
        Song likeWoah = new Song("Like Woah", 233, incredible);
        Song stainless = new Song("Stainless", 200, incredible);

        Song mathematics = new Song("Mathematics", 246, blackOnBothSides);
        Song got = new Song("Got", 208, blackOnBothSides);
        Song habitat = new Song("Habitat", 280, blackOnBothSides);
        Song love = new Song("Love", 283, blackOnBothSides);

        songRepo.save(goodMorning);
        songRepo.save(barryBonds);
        songRepo.save(champion);
        songRepo.save(goodLife);

        songRepo.save(blackBird);
        songRepo.save(rockyRacoon);
        songRepo.save(ObLaDi);
        songRepo.save(ussr);

        songRepo.save(fadeAway);
        songRepo.save(runIt);
        songRepo.save(likeWoah);
        songRepo.save(stainless);

        songRepo.save(mathematics);
        songRepo.save(got);
        songRepo.save(habitat);
        songRepo.save(love);

        Rating goodMorningRating = new Rating("Best song on the album by far", 5, goodMorning);
        Rating goodLifeRating = new Rating("Best song on the album by far", 5, goodLife);
        Rating barryBondsRating = new Rating("Best song on the album by far", 5, barryBonds);
        Rating championRating = new Rating("Best song on the album by far", 5, champion);

        Rating blackBirdRating = new Rating("Best song on the album by far", 5, blackBird);
        Rating rockyRacoonRating = new Rating("Best song on the album by far", 5, rockyRacoon);
        Rating obLaDiRating = new Rating("Best song on the album by far", 5, ObLaDi);
        Rating ussrRating = new Rating("Best song on the album by far", 5, ussr);

        Rating fadeAwayRating = new Rating("Best song on the album by far", 5, fadeAway);
        Rating runItRating = new Rating("Best song on the album by far", 5, runIt);
        Rating likeWoahRating = new Rating("Best song on the album by far", 5, likeWoah);
        Rating stainlessRating = new Rating("Best song on the album by far", 5, stainless);

        Rating mathematicsRating = new Rating("Best song on the album by far", 5, mathematics);
        Rating gotRating = new Rating("Best song on the album by far", 5, got);
        Rating habitatRating = new Rating("Best song on the album by far", 5, habitat);
        Rating loveRating = new Rating("Best song on the album by far", 5, love);

        ratingRepo.save(goodMorningRating);
        ratingRepo.save(goodLifeRating);
        ratingRepo.save(barryBondsRating);
        ratingRepo.save(championRating);

        ratingRepo.save(blackBirdRating);
        ratingRepo.save(rockyRacoonRating);
        ratingRepo.save(obLaDiRating);
        ratingRepo.save(ussrRating);

        ratingRepo.save(fadeAwayRating);
        ratingRepo.save(runItRating);
        ratingRepo.save(likeWoahRating);
        ratingRepo.save(stainlessRating);

        ratingRepo.save(mathematicsRating);
        ratingRepo.save(gotRating);
        ratingRepo.save(habitatRating);
        ratingRepo.save(loveRating);





    }
}

