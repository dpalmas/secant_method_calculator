package metodosecante;

import java.util.ArrayList;

public class Secante
{
    private static ArrayList<String> iteracoes = new ArrayList<String>();

    public static ArrayList getIteracoes()
    {
        return iteracoes;
    }

    public double raiz(Funcao f, double x0, double x1, int nMax, double tolerancia)
    {
        double r = Double.NaN;
        double x2 = x0;
        int k = 0;
        iteracoes.add(0, Double.toString(x2));
        while (Math.abs(f.eval(x2)) > tolerancia && k < nMax)
        {

            x2 = x0 - f.eval(x0) * (x1 - x0) / (f.eval(x1) - f.eval(x0));
            x0 = x1;
            x1 = x2;
            iteracoes.add(Double.toString(x2));
            k++;
        }
        if (k < nMax)
        {
            r = x2;
        }
        return r;
    }

    public void apagarIteracoes()
    {
        iteracoes.clear();
    }
}
