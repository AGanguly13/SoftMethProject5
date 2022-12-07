//package com.example.softmethproject5;
//
//import android.os.Bundle;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//import com.example.softmethproject5.databinding.ActivityMainBinding;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//
//    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
//
//    private int [] itemImages = {R.drawable.chicagobbq, R.drawable.chicagodeluxe, R.drawable.chicagomeatzza, R.drawable.chicagobuildyourown,
//            R.drawable.nypizza, R.drawable.nydeluxe, R.drawable.nymeatzza, R.drawable.nypizza};
//    private ActivityMainBinding binding;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//        RecyclerView pizzaRCView = findViewById(R.id.rcViewMain);
//        fillRecycleViewArray();
//        PizzaAdapter adapter = new PizzaAdapter(this, pizzas);
//        rcViewMain.setAdapter(adapter);
//        rcViewMain.setLayoutManager(new LinearLayoutManager(this));
//
//
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        BottomNavigationView navView = findViewById(R.id.nav_view);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);
//    }
//
//    private void fillRecycleViewArray() {
//        pizzas.add(new ChicagoPizza().createBBQChicken(Size.valueOf(R.string.largeSize)));
//        pizzas.add(new ChicagoPizza().createDeluxe(Size.valueOf(R.string.largeSize)));
//        pizzas.add(new ChicagoPizza().createMeatzza(Size.valueOf(R.string.largeSize)));
//        pizzas.add(new ChicagoPizza().createBuildYourOwn(null, Size.valueOf(R.string.largeSize)));
//        pizzas.add(new NYPizza().createBBQChicken(Size.valueOf(R.string.largeSize)));
//        pizzas.add(new NYPizza().createDeluxe(Size.valueOf(R.string.largeSize)));
//        pizzas.add(new NYPizza().createMeatzza(Size.valueOf(R.string.largeSize)));
//        pizzas.add(new NYPizza().createBuildYourOwn(null, Size.valueOf(R.string.largeSize)));
//    }
//
//}