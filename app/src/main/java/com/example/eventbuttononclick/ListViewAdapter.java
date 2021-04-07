//package com.example.eventbuttononclick;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.Filter;
//import android.widget.Filterable;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//import static com.example.eventbuttononclick.Home_Activity.classNamaArrayList;
//
//public class ListViewAdapter extends BaseAdapter {
//
//    Context mContext;
//
//    LayoutInflater inflater;
//
//    private ArrayList<ClassNama> arraylist;
//
//    public ListViewAdapter(Context context, int simple_list_item_1, ArrayList<ClassNama> classNamaArrayList){
//        mContext = context;
//
//        inflater = LayoutInflater.from(mContext);
//
//        this.arraylist = new ArrayList<ClassNama>();
//
//        this.arraylist.addAll(Home_Activity.classNamaArrayList);
//    }
//
//
//    public void notifyDataSetChanged() {
//        super.notifyDataSetChanged();
//    }
//
//    public class ViewHolder{
//        TextView name;
//    }
//
//
//    @Override
//    public int getCount() {
//        return classNamaArrayList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return classNamaArrayList.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//
//        final ViewHolder holder;
//
//        if(view == null){
//            holder = new ViewHolder();
//
//            view = inflater.inflate(R.layout.item_listview,null);
//
//            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
//
//            view.setTag(holder);
//        }
//        else {
//            holder = (ViewHolder) view.getTag();
//        }
//        holder.name.setText(classNamaArrayList.get(i).getName());
//        return view;
//    }
//}
