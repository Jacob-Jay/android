package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class ImageView extends AppCompatActivity {
    private android.widget.ImageView get_by_url;

    private String url = "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=false&word=%E5%A3%81%E7%BA%B8&step_word=&hs=0&pn=2&spn=0&di=84050&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=&lm=-1&st=undefined&cs=4260437209%2C787608598&os=3371440962%2C3806853916&simid=3361518703%2C345940308&adpicid=0&lpn=0&ln=2800&fr=&fmq=1574000337619_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=320&height=480&face=undefined&ist=&jit=&cg=wallpaper&bdtype=15&oriquery=%E5%A3%81%E7%BA%B8&objurl=http%3A%2F%2Fwww.desktx.cc%2Fd%2Ffile%2Fphone%2Fzhiwu%2F20170117%2Fsmall1702a4feaba1f6ad3a6222b35b524d81.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B1jfhpx_z%26e3BvvAzdH3Fri5gjAzdH3Fzito7AzdH3Fd8d9c_z%26e3Bip4s&gsm=&rpstart=0&rpnum=0&islist=&querylist=&force=undefined";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        get_by_url = findViewById(R.id.get_by_url);
        Glide.with(this).load(url).into(get_by_url);
    }
}
