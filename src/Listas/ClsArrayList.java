package Listas;
import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {

    public void ejemplo(){
        List <String> taskList = new ArrayList<String>();

        String lectura= "ir a votar";
        taskList.add(lectura);


        taskList.add("Hacer las compras");
        taskList.add("Pasear al perro");
        taskList.add("Lavar los platos");
        taskList.add("Hacer la cama");

//        System.out.println(taskList);
//        String primerTarea = taskList.get(0);
//        System.out.println("La primera tarea es: " + primerTarea);
//        taskList.remove(0);
//        primerTarea = taskList.get(0);
//        System.out.println("La primera tarea ahora es: " + primerTarea);

        int elementos=0;
        for (String tarea : taskList) {
            System.out.println(elementos+" Tarea:"+tarea);
            elementos++;
        }
        //Aca se esta interando para recorrer cada ino de los eementos de nuestra lista y nuestro ArrayList y se esta imprimiendo cada uno de los elementos
    }

    public void ListaNumeros(){
        List <Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(500);
        numbersList.add(1000);
        numbersList.add(1500);
        numbersList.add(2000);
        numbersList.add(2500);


        int suma=0;
        for ( int n : numbersList) {
            System.out.println("El numero es:"+suma);
            suma = suma+n;
        }
        System.out.println("La suma de los numeros es:"+suma);
    }
    public void ListaTareas(){
        List <TaskList> task = new ArrayList<TaskList>();
        TaskList tareaIndividual= new TaskList();

        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("Ir a la torre a comprar la leche");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        tareaIndividual.setTaskName("Pasear al perro");
        tareaIndividual.setTaskDescription("Llevarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        tareaIndividual.setTaskName("Lavar los platos");
        tareaIndividual.setTaskDescription("Lavar los platos despues de comer");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        task.get(0).setDone(true);
        task.get(1).setDone(true);




        int NTask=0;
        for(TaskList tarea: task){
            if (tarea.isDone()) {
                System.out.println("La tarea ya esta hecha");
                System.out.println("Tarea: " + tarea.getTaskName() + " Descripcion: " + tarea.getTaskDescription());
            }
                NTask++;
        }
    }
}
