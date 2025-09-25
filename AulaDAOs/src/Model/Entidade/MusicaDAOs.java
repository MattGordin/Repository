package Model.Entidade;

public class MusicaDAOs {
    public void cadastrarMusica(Musica musica){
        String sql = "insert into pessoa (titulo, artista, album, anoLancamento, genero, duracaoEmSegundos, letra) values ("+ musica.getTitulo() + "," + musica.getArtista() + "," + musica.getAlbum() + "," + musica.getAnoLancamento() + "," + musica.getGenero() + "," + musica.getDuracaoEmSegundos() + "," + musica.getLetra() +")";
    }
}