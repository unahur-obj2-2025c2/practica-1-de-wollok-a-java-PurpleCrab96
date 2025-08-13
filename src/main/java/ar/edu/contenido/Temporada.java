package ar.edu.contenido;


public class Temporada {
    private final Integer numero;
    private List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public Temporada(Integer numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public double costo() {
        return episodios.stream().mapToDouble(Episodio::costo).average().orElse(0.0);
    }
}