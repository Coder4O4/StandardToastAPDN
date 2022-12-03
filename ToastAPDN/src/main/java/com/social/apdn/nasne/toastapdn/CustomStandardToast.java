package com.social.apdn.nasne.toastapdn;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomStandardToast {

    public static void simpleWarningToast(Context context, String toastMessage, int toastType) {
        Toast simpleWarToast = new Toast(context);
        View toastView = LayoutInflater.from(context)
                .inflate(R.layout.simple_toast_war_message, null);
        TextView toastMessView = toastView.findViewById(R.id.simpleWarningToast);
        int toastMessLength = toastMessage.length();
        simpleWarToast.setView(toastView);

        if (toastMessLength >= 70)
        {
            if(toastType == 1){
                toastMessView.setText(toastMessage);
                simpleWarToast.show();
            }
            else
            {
                toastMessView.setText("Warning : your toast is too long.");
                simpleWarToast.show();
            }
        }
        else
        {
            toastMessView.setText(toastMessage);
            simpleWarToast.show();
        }

    }

    public static  void likeToast(Context context , int likeCount)
    {
        Toast likeToast = new Toast(context);
        View likeToastView = LayoutInflater.from(context)
                .inflate(R.layout.likes_toast , null);

        TextView likes = likeToastView.findViewById(R.id.setLikesT);
        likes.setText(Integer.toString(likeCount));
        likeToast.setView(likeToastView);
        likeToast.show();


    }


    public  static void torchLightStatus(Context context ,int torchMode){
        Toast torchToast = new Toast(context);
        View torchView = LayoutInflater.from(context)
                .inflate(R.layout.torch_toast_layout, null);
        ImageView torchOn = torchView.findViewById(R.id.torchOnIMG);
        ImageView torchOff = torchView.findViewById(R.id.torchOffIMG);
        TextView torchToastMess = torchView.findViewById(R.id.torchStatus);
        torchToast.setGravity(Gravity.TOP ,0 , 0);

        int ON = 6;
        if (torchMode ==ON)
        {
            torchOn.setVisibility(View.VISIBLE);
            torchToastMess.setText("Torch ON");
            torchToast.setView(torchView);
            torchToast.show();
        }
        else
        {
            torchOff.setVisibility(View.VISIBLE);
            torchToastMess.setText("Torch OFF");
            torchToast.setView(torchView);
            torchToast.show();
        }

    }
}
