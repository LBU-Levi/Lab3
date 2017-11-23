package com.example.todofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class TodoFragment extends Fragment
{
    private TaskList m_taskList;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        InitialiseApp();
    }

    private void InitialiseApp()
    {
        m_taskList = new TaskList("Test title", true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_todo, container, false);

        final EditText mEditTextTitle = view.findViewById(R.id.todo_title);
        mEditTextTitle.setText(m_taskList.getTitle());

        mEditTextTitle.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                // This line is intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                m_taskList.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s)
            {
                // This line is intentionally left blank
            }
        });

        final Button mButtonDate = view.findViewById(R.id.todo_date);
        mButtonDate.setText(m_taskList.getDate().toString());
        mButtonDate.setEnabled(false);

        final CheckBox mCheckBoxIsComplete = view.findViewById(R.id.todo_complete);
        mCheckBoxIsComplete.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                m_taskList.setIsComplete(isChecked);
            }
        });

        return view;
    }
} 