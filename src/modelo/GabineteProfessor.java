package modelo;

import java.util.LinkedList;

public class GabineteProfessor extends Descritor{
    private boolean portaAberta;
    private LinkedList<Professor> professores;

    public GabineteProfessor(String nome) {
        super(nome);
    }

    public boolean isPortaAberta(){
        return portaAberta;
    }

    public LinkedList<Professor> getProfessores(){
        return new LinkedList<>(professores);
    }

    public LinkedList<Professor> getProfessores(Horario horario){
        return null;
    }

    public void abrir(){

    }

    public void fechar(){

    }

    public void remover(Aula aula){

    }

    public void adicionar(Aula aula){

    }

}