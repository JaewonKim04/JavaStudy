package day_0423_nested_class.example;

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
