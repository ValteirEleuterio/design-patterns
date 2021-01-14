package observer.utilizandoImplementacaoPropria;

public class Perseguicao {

    public static void main(String[] args) {
        CarroRoubado fuscaRoubado = new CarroRoubado();

        CarroPolicia carroPolicia = new CarroPolicia(fuscaRoubado);
        MotoPolicia motoPolicia = new MotoPolicia(fuscaRoubado);

        fuscaRoubado.virarPara("Esquerda");
        fuscaRoubado.virarPara("Esquerda");
        fuscaRoubado.virarPara("Direita");
        fuscaRoubado.virarPara("Direita");

        motoPolicia.pararPerseguicao();

        fuscaRoubado.virarPara("Esquerda");
    }
}
