package observer.utilizandoImplementacaoPropria;

public class CarroPolicia implements Observer {

    private Subject observado;

    public CarroPolicia (Subject observado) {
        this.observado =  observado;
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
        System.out.println("Carro da policia virando para " + direcao);
    }

}
