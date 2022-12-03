package com.social.apdn.nasne.toastapdn;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CopySocialLink {

    public static void copyMethod(Context context, String link, int getIcon){

         ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
         ClipData clip = ClipData.newPlainText("Copied Text", link.toString());
         clipboard.setPrimaryClip(clip);
         showCopiedLinkToast(getIcon , context);
    }


    private static void showCopiedLinkToast(int getIcon, Context context) {

        Toast copySocialLink = new Toast(context);
        View socialLinkCV = LayoutInflater.from(context)
                .inflate(R.layout.copy_social_link_sample , null);

        ImageView linkLogo = socialLinkCV.findViewById(R.id.copyLinkLogo);
        TextView linkPlatform = socialLinkCV.findViewById(R.id.copyLink);

        if (getIcon==1)
        {
            linkLogo.setBackgroundResource(R.drawable.facebook_logo);
            linkPlatform.setText("Facebook Link Copied");
        }
        else if (getIcon==2)
        {
            linkLogo.setBackgroundResource(R.drawable.youtube_logo);
            linkPlatform.setText("Youtube Link Copied");
        }
        else if (getIcon== 3)
        {
            linkLogo.setBackgroundResource(R.drawable.twtter_logo);
            linkPlatform.setText("Twitter Link Copied");
        }
        else if (getIcon== 4)
        {
            linkLogo.setBackgroundResource(R.drawable.insta_logo);
            linkPlatform.setText("Instagram Link Copied");
        }
        else if (getIcon== 5)
        {
            linkLogo.setBackgroundResource(R.drawable.other_link);
            linkPlatform.setText("Link Copied");
        }
        copySocialLink.setView(socialLinkCV);
        copySocialLink.setGravity(Gravity.TOP|Gravity.LEFT, 0 ,0);
        copySocialLink.show();

    }

}
