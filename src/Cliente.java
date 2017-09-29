public class Cliente extends Pessoas {
    private boolean comFilme;
    private String filme;
    private boolean devendo;

    public boolean isComFilme() {
        return comFilme;
    }

    public void setComFilme(boolean comFilme) {
        this.comFilme = comFilme;
    }

    public boolean isDevendo() {
        return devendo;
    }

    public void setDevendo(boolean devendo) {
        this.devendo = devendo;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
    
}
