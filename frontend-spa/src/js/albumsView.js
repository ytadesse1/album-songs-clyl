export default function albumsView(album){
    return `
        <main class="main-content">
        <div class="album-header">
                    <h2 class="campus-library-header__title">${album.title}</h2>
                    <h3 class="campus-library-header__recordLabel">${album.recordLabel}</h3>
                    </div>
                <div class="albums-container">
                    ${
                        album.songs.map(song => {
                            return `
                                <div class="song">
                                <img class="album-cover" src="./src${album.imgUrl}">
                                    <h3 class="song-title">${song.name}</h3>
                                </div>
                            `
                        }).join("")
                    }
                </div>
                <div class="NewSongDiv">
                    <input type="text" placeholder="Song Name" class="songNameInput" \>
                    <input type="text" placeholder="Song Description" class="songDescriptionInput" \>
                    
                    <button class="addsongButton">Add song</button>
                </div>
                <a class="back-navigation">back to album listings</a>
        </main>
    `
}