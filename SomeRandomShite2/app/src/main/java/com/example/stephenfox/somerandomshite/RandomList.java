import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class RandomList extends ListActivity {
    String[] s = {"S", "T", "Hello", "World"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setListAdapter(new CustomAdapter(this, s));

    }


    class CustomAdapter extends BaseAdapter {

        Context context;
        String[] data;
        LayoutInflater inflater = null;


        public CustomAdapter(Context context, String[] data) {
            this.context = context;
            this.data = data;
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public Object getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;

            if (row == null) {
                row = inflater.inflate(R.layout.row, null);
            }

            TextView textView = (TextView)row.findViewById(R.id.text);
            textView.setText(data[position]);

            Button button = (Button) row.findViewById(R.id.button);
            button.setText(data[position]);
            return row;
        }
    }

}
