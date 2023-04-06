package ru.netology.java11.Java11.poster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testAddNewFilm() {
        Manager manager = new Manager();

        manager.add("Movie1");

        String[] expected = {"Movie1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2NewFilms() {
        Manager manager = new Manager();

        manager.add("Movie2");
        manager.add("Movie3");

        String[] expected = {"Movie2", "Movie3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowAllMovies() {
        Manager manager = new Manager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShowLastWithParameter() {
        Manager manager = new Manager(5);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");

        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6"};
        String[] actual = manager.findLast();

    }

    @Test
    public void testShowLastWhenUnderParameter() {
        Manager manager = new Manager(5);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");

        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

    }

    @Test
    public void testShowLastWhenEqualParameter() {
        Manager manager = new Manager(5);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");

        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

    }

    @Test
    public void testShowLastWhenAboveParameter() {
        Manager manager = new Manager(5);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");

        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

    }

    @Test
    public void testShowLastUnderLimit() {
        Manager manager = new Manager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");

        String[] expected = {"Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testShowLastEqualLimit() {
        Manager manager = new Manager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");

        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testShowLastAboveLimit() {
        Manager manager = new Manager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");
        manager.add("Movie11");

        String[] expected = {"Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = manager.findLast();
    }
}

