package day_0421_nested._class.example;

public class Button {
	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
}
