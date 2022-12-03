## StandardToastAPDN

>Version : Tag = StandardToast


![Screenshot (28)](https://user-images.githubusercontent.com/114288510/205437985-04ec2ecd-5e97-4b98-870e-f3038994d955.png)
![Screenshot (30)](https://user-images.githubusercontent.com/114288510/205437998-c26ba573-8914-4cef-b0dc-7ad4beb3b67a.png)
![Screenshot (32)](https://user-images.githubusercontent.com/114288510/205438023-ebfd72b0-5cd9-4e47-ba72-9df0563e2299.png)
![Screenshot (29)](https://user-images.githubusercontent.com/114288510/205438038-15fa0bc3-9c0c-45a0-a2fd-230a6825b5a3.png)

>Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

>Add Dependency
```gradle
	dependencies {
	        implementation 'com.github.Coder4O4:ToastAPDN:Tag'
	}
```

>Feature 1 : Simple Toast
```java
 button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomStandardToast.simpleWarningToast(MainActivity.this , message , GetToastType.LONG);
            }
        });
```

>Feature 2 : Like Toast

```java
 button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomStandardToast.likeToast(Context ,likeCount);
            }
        });
```
>Feature 3 : Torch On Off Toast

```java
 button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 CustomStandardToast.torchLightStatus(Context , Torch.TORCH_ON);
            }
        });
```
>Feature 4 : Copy Link Toast

```java
 button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = url.toString();
                CopySocialLink.copyMethod(MainActivity.this ,link  , GetIcon.UNKNOWN);
            }
        });
```
