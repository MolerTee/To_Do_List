package example.codeclan.com.to_do_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button homeScreenButton;
    Button showTaskButton;
    Button createTaskButton;
    Button addTaskButton;
    TextView welcomeMessage;
    EditText taskTitle;
    EditText taskDetails;
    ListView taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeScreenButton = (Button)findViewById(R.id.home_button);
        showTaskButton = (Button)findViewById(R.id.show_task_button);
        createTaskButton = (Button)findViewById(R.id.create_task_button);
        addTaskButton = (Button)findViewById(R.id.add_task_button);
        welcomeMessage = (TextView)findViewById(R.id.welcome_message);
        taskTitle = (EditText)findViewById(R.id.task_title_text_box);
        taskDetails = (EditText)findViewById(R.id.task_details_text_box);
        taskList = (ListView)findViewById(R.id.task_list);

    }

    public void onShowTaskButtonClick(){
        homeScreenButton.setVisibility(View.VISIBLE);
        showTaskButton.setVisibility(View.INVISIBLE);
        createTaskButton.setVisibility(View.VISIBLE);
        addTaskButton.setVisibility(View.INVISIBLE);
        welcomeMessage.setVisibility(View.INVISIBLE);
        taskTitle.setVisibility(View.INVISIBLE);
        taskDetails.setVisibility(View.INVISIBLE);
        taskList.setVisibility(View.VISIBLE);
    }

    public void onCreateTaskButtonClick(){
        homeScreenButton.setVisibility(View.VISIBLE);
        showTaskButton.setVisibility(View.INVISIBLE);
        createTaskButton.setVisibility(View.VISIBLE);
        addTaskButton.setVisibility(View.INVISIBLE);
        welcomeMessage.setVisibility(View.INVISIBLE);
        taskTitle.setVisibility(View.INVISIBLE);
        taskDetails.setVisibility(View.INVISIBLE);
        taskList.setVisibility(View.VISIBLE);
    }

    public void onAddTaskButtonClick(){
        homeScreenButton.setVisibility(View.VISIBLE);
        showTaskButton.setVisibility(View.INVISIBLE);
        createTaskButton.setVisibility(View.INVISIBLE);
        addTaskButton.setVisibility(View.VISIBLE);
        welcomeMessage.setVisibility(View.INVISIBLE);
        taskTitle.setVisibility(View.INVISIBLE);
        taskDetails.setVisibility(View.INVISIBLE);
        taskList.setVisibility(View.VISIBLE);
    }

    public void onHomeScreenButtonClick(){
        homeScreenButton.setVisibility(View.INVISIBLE);
        showTaskButton.setVisibility(View.VISIBLE);
        createTaskButton.setVisibility(View.VISIBLE);
        addTaskButton.setVisibility(View.INVISIBLE);
        welcomeMessage.setVisibility(View.VISIBLE);
        taskTitle.setVisibility(View.INVISIBLE);
        taskDetails.setVisibility(View.INVISIBLE);
        taskList.setVisibility(View.INVISIBLE);
    }




}
