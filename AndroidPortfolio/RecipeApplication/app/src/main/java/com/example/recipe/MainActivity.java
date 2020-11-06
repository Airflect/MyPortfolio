package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Rollitos de Pollo","6 filetes de pollo" +
                "6 rebanadas de jamón tipo york" +
                "1 paquete de Queso Philadephia" +
                "1 taza de harina" +
                "2 huevos" +
                "1 taza de pan rallado" +
                "1/2 tazas de queso parmesano" +
                "1 aceite" +
                "2 cucharaditas de sal"
                ,"Preparación",
                "Calienta la mantequilla y sofríe la mitad de la cebolla; agrega la harina, cocina hasta obtener un color dorado claro y reserva. Licúa la Leche Evaporada CARNATION® CLAVEL® con la cebolla, el agua, el cilantro y el consomé de pollo en polvo; cuela y cocina a fuego bajo por 10 minutos o hasta que espese ligeramente. Retira del fuego y reserva.\n" +
                        "Para los rollitos, calienta 2 cucharadas de aceite y sofríe la cebolla; agrega las rajas con el consomé de pollo en polvo y cocina por 5 minutos. Retira del fuego y reserva. Coloca sobre las pechugas, previamente salpimentadas, un poco de queso crema y de rajas; enróllalas de manera que no se salga el relleno.\n" +
                        "Hornear en un sartén, caliente el aceite restante y sella los rollitos; colócalos en un refractario y hornea por 30 minutos. Retira del horno, rebánalos y ofrécelos con la salsa de cilantro caliente. Acompaña con arroz con verduras.\n",R.drawable.chicken_roll));

        recipes1.add(new Recipes("Donas","4 tazas de harina" +
                "10 gramos de levadura seca" +
                "3/4 tazas de leche de vaca" +
                "3/4 tazas de azúcar" +
                "1/2 cucharaditas de sal" +
                "3 huevos" +
                "1/4 tazas de mantequilla" +
                "suficiente de harina, para extender" +
                "suficiente de aceite, para freír","Preparación","\n" +
                "En un bowl, mezcla harina, levadura, leche, el azúcar, la sal, los huevos y amasa hasta que quede una buena consistencia. Agrega la mantequilla y continúa amasando por 15 minutos más o hasta que esté suave.\n" +
                "Coloca la masa en un bowl previamente engrasado y tapa con un trapo húmedo. Deja reposar por 1 hora.\n" +
                "Sobre una superficie enharinada extiende la masa con un rodillo de 1 cm de ancho y deja reposar sobre la mesa por 10 minutos antes de cortar\n" +
                "En una ollita a fuego medio, calienta el aceite y con ayuda de un palito, fríe las donas por los dos lados. Cuando estén doraditas, retira y escurre en papel absorbente para quitar el exceso de grasa. Espolvorea con azúcar y disfruta.",R.drawable.donut1));
        recipes1.add(new Recipes("Dosa","3 tazas de arroz" +
                "1 taza de de lentejas" +
                "Sal" +
                "Aceite" +
                "4 patatas grandes.","Preparación",
                "Cocer el arroz, escurrirlo y enfriarlo. Pasarlo a un cuenco grande con el doble de su volumen en agua. Dejarlo reposar 8 horas o toda la noche.\n" +
                        "Poner en remojo las urad dal o lentejas, con bastante agua, y también durante toda la noche.\n" +
                        "Al día siguiente, escurrir el arroz y las dal o lentejas. Poner el arroz en la batidora, y trabajarlo hasta conseguir una pasta homogénea y sin grumos, añadiendo poco a poco 1 vaso de agua.\n" +
                        "Pasarlo a un cuenco grande, y repetir la operación con las urad dal, batiéndolas mientras añadimos agua hasta conseguir una pasta homogénea.\n" +
                        "Verter la masa en una sartén antiadherente con un cazo y extender bien la masa, para hacer dosas muy finas. Si la masa no se extiende se queman antes de hacerse.",R.drawable.dosa1));
        recipes1.add(new Recipes("Pancakes","1 taza de harina" +
                "1 cucharada de azúcar" +
                "2 cucharaditas de polvo para hornear" +
                "1/4 cucharaditas de sal" +
                "1 huevo" +
                "2 cucharadas de mantequilla, derretida" +
                "1 taza de leche de vaca","Preparación",
                "En un tazón combinar la harina, azúcar, polvo de hornear y sal.\n" +
                        "En otro tazón mezclar la mantequilla, leche y huevo.\n" +
                        "Poner la mezcla de leche al tazón de la harina y revolver con un batidor de globo. La pasta deberá quedar con unos grumos pequeños.\n" +
                        "Calentar un sartén grande a que esté bien caliente y luego hacer los pancakes poniendo la pasta con una cuchara grande sobre el sartén a que queden del tamaño deseado.\n" +
                        "Voltearlos con una espátula cuando empiecen a salir burbujitas, para cocinar del otro lado. Servir acompañados de mantequilla y miel de maple.",R.drawable.pancakes));
        recipes1.add(new Recipes("Pasta Alfredo","100 ml de nata." +
                "50 ml de leche." +
                "1 diente de ajo." +
                "30 gr de queso parmesano." +
                "1 cucharada sopera de mantequilla." +
                "Sal y pimienta negra recién molida." +
                "Sal.","Preparación",
                "En primer lugar preparamos los tallarines: pon abundante agua en una olla (que después cubra de sobra la pasta) a fuego fuerte hasta que hierva. Cuando hierva, incorpora una cucharadita de sal y la pasta, y cuando vuelva a hervir, deja que se cueza durante los minutos que indique el paquete (en este caso son 8).\n" +
                        "Cuando se cumpla el tiempo de la pasta, escúrrela y sin que se enfríe ponla en los platos con la salsa Alfredo, que la habremos elaborad mientras se calentaba el agua y se cocían.\n" +
                        "Ahora vamos a preparar la salsa Alfredo. Pela el ajo y pícalo muy finito, y ponlo en una sartén junto con la mantequilla, a fuego medio.\n" +
                        "Cuando empiece a dorarse, echa en la sartén la nata y la leche junto con una pizca de sal y pimienta negra recién molida al gusto, y deja que hierva durante 2 o 3 minutos para que espese un poco.\n" +
                        "Ralla el queso parmesano con un buen rallador, échalo a la sartén y revuélvelo todo junto un par de minutos. Si la quieres más espesa déjala más tiempo en el fuego, pero si por el contrario  la quieres más líquida, échale un poco más de leche. Lo ideal es que sea una salsa más bien líquida que densa.",R.drawable.pasta1));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
