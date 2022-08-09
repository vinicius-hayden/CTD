package entities;

import java.util.Arrays;

public class Ip {

    private int[] numeroIp = new int[4]; // 0 1 2 3

    public Ip(int n0, int n1, int n2, int n3) {
        this.numeroIp[0] = n0;
        this.numeroIp[1] = n1;
        this.numeroIp[2] = n2;
        this.numeroIp[3] = n3;
    }

    // Método para retornar o país!
    public String getPais() {
        String pais = "";
        if (numeroIp[0] <= 49) {
            pais = "Argentina";
        } else if (numeroIp[0] <= 99) {
            pais = "Brasil";
        } else {
            pais = "Colômbia";
        }
        return pais;
    }

    @Override
    public String toString() {
        return "Ip { " +
                "numeroIp=" + Arrays.toString(numeroIp) +
                '}';
    }
}