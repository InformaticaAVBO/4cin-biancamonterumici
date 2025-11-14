public class App {
    public static void main(String[] args) throws Exception {

        Coppia<String, Persona> p= new Coppia <>("prof", new Persona("Sandro","rossi"));
        Coppia<String, Persona> q= new Coppia <>("comandante", new Persona("giuseppe","garibaldi"));
        System.out.println(p);
        System.out.println("primo: " + q.getPrimo());
        System.out.println("secondo: " + q.getSecondo());

        Vettore<String> x = new Vettore<>(0, 0);
        for (int i=0; i<24; i++)
            x.add("Juve_" + i);
        System.out.println(x);

        
        System.out.println(x.get(3));
        System.out.println(x.get(3).getClass());

        Vettore<Persona> elenco = new Vettore<Persona>(10, 5);

        
    }
}