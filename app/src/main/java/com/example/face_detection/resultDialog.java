package com.example.face_detection;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class resultDialog extends DialogFragment {
    private Button b1;
    private TextView tv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_result,container,false);
        String resultText="";
        b1=view.findViewById(R.id.result_ok_button);
        tv=view.findViewById(R.id.result_text_view);
        Bundle bundle=getArguments();
        resultText=bundle.getString(faceDetect.Result_Text);
        tv.setText(resultText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return view;
    }
}
