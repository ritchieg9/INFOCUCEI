package inf.ritchieg9.cucei;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	// Array of strings storing country names
	
	int position = -1;
	
	
String[] countries = new String[] {
"General",
"Egresados",
"Materias",
"Directorio",
"Especialidad",
"Galeria",
"Twitter",
"Facebook",
"Acerca De",
"Extras"
    };

// Array of integers points to images stored in /res/drawable-ldpi/
int[] flags = new int[]{
		R.drawable.general,
		R.drawable.egresados,
		R.drawable.materias,
		R.drawable.directorio,
		R.drawable.especialidad,
		R.drawable.galeria,
		R.drawable.twitter,
		R.drawable.facebook,
		R.drawable.acercade,
		R.drawable.extras
    };

// Array of strings to store currencies
String[] currency = new String[]{
	"Nuestro Centro Universitario",
	"Perfil de Egresado",
	"Cat�logo de Materias",
	"Directorio de Personal",
	"Rama de Especialidades",
	"Galeria de CUCEI",
	"Siguenos en Twitter",
	"Contactanos en Facebook",
	"Desarrollador",
	"Información"
    };


@Override
public void onCreate(Bundle savedInstanceState) {
	
	
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
//NOTA *
/*Unhasmapesunaestructurade java quenospermiteguardar pares devaloresclave/valor, 
detalmaneraqueparacadaclave�nicamente hay un solo valor, no pudiendohaberdos
clavescon el mismo valor.*/


        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        

for(int i=0;i<10;i++){
	HashMap<String, String> hm = new HashMap<String,String>();
hm.put("txt",  countries[i]);
hm.put("cur",  currency[i]);
hm.put("flag", Integer.toString(flags[i]) );            
aList.add(hm);        
        }

//regresa el contenido
String[] from = { "flag","txt","cur" };


//regresa la posicion
int[] to = { R.id.flag,R.id.txt,R.id.cur};        

// escojemos el layout qe vamos a usa y los valore qye recibe
SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.layout_imagenes, from, to);

// hacemos la referencia al objeto para poderlo programas
ListView listView =  (ListView) findViewById(R.id.listView1);

// asignamos el layout a la lista
listView.setAdapter(adapter);  

//seleccionado = (TextView)findViewById(R.id.txt);

listView.setOnItemClickListener(new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		//Log.e("MeetingCost","Has seleccionado el elemento C " + arg3);
		position = (int) arg3;
		//Log.e("MeetingCost","Position" + position);
		
		if(position  ==0){
			  Intent intent  = new Intent(MainActivity.this, General.class);
			MainActivity.this.startActivity(intent);
			  }

		if(position==1){
			  Intent intent1  = new Intent(MainActivity.this, Egresados.class);
			MainActivity.this.startActivity(intent1);
			    }
		if(position==2){
			  Intent intent2  = new Intent(MainActivity.this, Materias.class);
			MainActivity.this.startActivity(intent2);
			  }

		if(position==3){
			  Intent intent3  = new Intent(MainActivity.this, Directorio.class);
			MainActivity.this.startActivity(intent3);
			    }
		if(position==4){
			  Intent intent4  = new Intent(MainActivity.this, Especialidad.class);
			MainActivity.this.startActivity(intent4);
			  }

		if(position==5){
			  Intent intent5  = new Intent(MainActivity.this, Galeria.class);
			MainActivity.this.startActivity(intent5);
			    }
		if(position==6){
			  Intent intent6  = new Intent(MainActivity.this, Twitter.class);
			MainActivity.this.startActivity(intent6);
			  }

		if(position==7){
			  Intent intent7  = new Intent(MainActivity.this, Facebook.class);
			MainActivity.this.startActivity(intent7);
			    }
		if(position==8){
			  Intent intent8  = new Intent(MainActivity.this, Acercade.class);
			MainActivity.this.startActivity(intent8);
			  }

		if(position==9){
			  Intent intent9  = new Intent(MainActivity.this, Extras.class);
			MainActivity.this.startActivity(intent9);
			  }
		
	} });

    }



@Override
public boolean onCreateOptionsMenu(Menu menu) {
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }
}
