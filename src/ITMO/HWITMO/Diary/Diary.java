package ITMO.HWITMO.Diary;

import java.util.ArrayList;

public class Diary {
    private ArrayList<String> notes, tasks;

    public Diary(){
        notes = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void setEntry(Entry entry){
        if (entry instanceof Task){
            System.out.println("Добавлена задача: " + entry.getEntryName());
            this.tasks.add(entry.getEntryName());
        }
        if (entry instanceof Note){
            System.out.println("Добавлен комментарий " + entry.getEntryName());
            this.notes.add(entry.getEntryName());
        }

    }

    public ArrayList<String> getNotes(){
        System.out.println("Список комментариев:");
        return this.notes;
    }

    public void delNote(int index) {
        System.out.println("Удален комментарий: " + this.notes.get(index - 1));
        this.notes.remove(index - 1);
    }

    public ArrayList<String> getTasks(){
        System.out.println("Список задач:");
        return this.tasks;
    }

    public void delTask(int index) {
        System.out.println("Удалена задача: " + this.tasks.get(index -1));
        this.tasks.remove(index - 1);
    }


    public static void main(String[] args) {
        Diary diary = new Diary();
        Note note1 = new Note("Купить свежий творог");
        Note note2 = new Note("Поменять колеса");
        Note note3 = new Note("Помыть машину");


        Task task1 = new Task("Заехать домой");
        Task task2 = new Task("Купить творог");
        Task task3 = new Task("Купить молоко");



        diary.setEntry(task1);
        diary.setEntry(task2);
        diary.setEntry(task3);

        System.out.println(diary.getTasks());
        diary.delTask(2);
        System.out.println(diary.getTasks());


        diary.setEntry(note1);
        diary.setEntry(note2);
        diary.setEntry(note3);
        System.out.println(diary.getNotes());
        diary.delNote(1);
        System.out.println(diary.getNotes());
    }
}