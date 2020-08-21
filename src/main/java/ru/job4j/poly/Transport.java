package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int countPassenger);

    double fill(double countFuel);
}
