import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Countries extends BaseAdapter {
    private Context context;
    private int[] images;
    private String[] countries;
    private String[] capitalCities;
    private LayoutInflater inflater;

    public Countries(Context context, int[] images, String[] countries, String[] capitalCities) {
        this.context = context;
        this.images = images;
        this.countries = countries;
        this.capitalCities = capitalCities;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spinner, parent, false);
        ImageView img = view.findViewById(R.id.countryFlag);
        TextView countryName = view.findViewById(R.id.country);
        TextView capitalcity = view.findViewById(R.id.capitalCity);
        img.setImageResource(images[i]);
        countryName.setText(countries[i]);
        capitalcity.setText(capitalCities[i]);
        return view;
    }
}