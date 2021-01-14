package observer.utilizandoImplementacaoPropria;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado implements Subject {

    private List<Observer> observers;
    private String direcao;

    public CarroRoubado() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }

    public void virarPara(String direcao) {
        this.direcao = direcao;
        System.out.println("Ladrão virando para " + direcao);
        notifyObservers();
    }

    public String getDirecao() {
        return this.direcao;
    }
}
