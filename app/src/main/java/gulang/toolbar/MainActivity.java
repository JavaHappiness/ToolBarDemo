package gulang.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //标题，注意：要设置在setSupportActionBar()之前
        toolbar.setTitle("返回");
        //Toolbar取代原本的 actionbar,
        setSupportActionBar(toolbar);
        //设置副标题
        toolbar.setSubtitle("副标题");
        //设置副标题颜色
        toolbar.setSubtitleTextColor(getResources().getInteger(R.color.colorAccent));
        //设置Logo
        toolbar.setLogo(R.mipmap.ic_launcher);
        //设置图标
        toolbar.setNavigationIcon(R.mipmap.actionbar_back);
        //点击事件要设置在setSupportActionBar()之后
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.action_back, Toast.LENGTH_LONG).show();
            }
        });
        //设置点击事件
        toolbar.setOnMenuItemClickListener(this);
    }

    //加载菜单的布局
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * 设置Toolbar头部item点击事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_edit:
                Toast.makeText(getApplicationContext(), R.string.action_edit, Toast.LENGTH_LONG).show();
                break;
            case R.id.action_share:
                Toast.makeText(getApplicationContext(), R.string.action_share, Toast.LENGTH_LONG).show();
                break;
            case R.id.action_next:
                Toast.makeText(getApplicationContext(), R.string.action_next, Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

}
