package com.example.foody.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.foody.Home.Adapter;
import com.example.foody.Home.Product;
import com.example.foody.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    GridView gridView;
    List<Product> list;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        gridView = root.findViewById(R.id.gridView);

        registerForContextMenu(gridView);
        ArrayList<Product> arrayList=new ArrayList<>();
        arrayList.add(new Product("2 Béo- Bánh Sầu Riêng, Shop Online",R.drawable.img2,"Bánh ngon, vừa miệng, ăn không ngán, đặc biệt sầu riêng rất nhiều và thơm, rất đáng mua nha mọi người"));
        arrayList.add(new Product("Nhà Hàng Parsley - Steak, Pasta & Hơn Thế Nữa!",R.drawable.img3,"Mình đặt bàn sinh nhật cho 2 người, nhà hàng trang trí miễn phí 1 góc bên cửa sổ tầng 2 nhìn rất đẹp. Các bạn nhân viên rất nhiệt tình dễ thương."));
        arrayList.add(new Product("A Xìn - Chân Gà Rút Xương Ngâm Sả Tắc - Shop Online",R.drawable.im4,"Nay có dịp ms đặt ăn. Chưa bao giờ ăn cái này. Có mã nên đặt thử ăn. Chân gà dai dai ăn đã lắm. Nứic chấm ngon."));
        arrayList.add(new Product("Bắp Mễ",R.drawable.img5,"Bắp ở đây có hơn 10 vị sốt siêu độc, từ phô mai, ruốc, xí muội,... siêu lạ mà siêu hợp. Ăn 1 lần là ghiền luôn, mình chắc chắn sẽ thử hết các vị của quán trong thời gian sắp tới"));
        arrayList.add(new Product("Món Quảng Xuyên Việt",R.drawable.im6,"Đến cơm niêu Thiên Lý mà đi nhóm từ 3 người gọi mâm cơm gia đình hay các set có sẵn thì đỡ phải lật qua lật lại chọn món."));
        arrayList.add(new Product("Cơm Niêu Thiên Lý - Hoàng Hoa Thám",R.drawable.img7,"Không gian quán ở đây rất ấn tượng, thiết kế mang phong cách hiện đại, có điều hòa mát rượi."));
        Adapter adapter=new Adapter(getActivity(),R.layout.gridview_row,arrayList);
        gridView.setAdapter(adapter);

        //gird

        //slide
        ImageSlider imageSlider = root.findViewById(R.id.slider);
        List<SlideModel> slideModels =new ArrayList<>();
        slideModels.add(new SlideModel("https://images.foody.vn/biz_banner/foody-upload-api-food-biz-201030174815.jpg"));
        slideModels.add(new SlideModel("https://images.foody.vn/bookingcollection/s1170x140/beauty-upload-api-1170x140-201030172503.jpg"));
        slideModels.add(new SlideModel("https://media.foody.vn/images/beauty-upload-api-675x355-201109114729.jpg"));
        slideModels.add(new SlideModel("https://images.foody.vn/biz_banner/foody-upload-api-food-biz-201030172853.jpg"));
        imageSlider.setImageList(slideModels,true);
        return root;

    }

}