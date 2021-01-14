package observer.utilizandoImplementacaoPropria;

public class MotoPolicia implements Observer {

    private Subject observado;

    public MotoPolicia(Subject observado) {
        this.observado = observado;
        observado.registerObserver(this);
    }

    @Override
    public void update(Object arg) {
        if (arg instanceof CarroRoubado) {
            CarroRoubado carroRoubado = (CarroRoubado) arg;
            perseguir(carroRoubado.getDirecao());
        }
    }

    private void perseguir(String direcao) {
        System.out.println("Moto da policia virando para " + direcao);
    }

    public void pararPerseguicao() {
        observado.removeObserver(this);
    }
}
