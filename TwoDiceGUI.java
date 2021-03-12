import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoDiceGUI extends JFrame implements ActionListener
{
	Font mainFont = new Font("Impact", Font.PLAIN, 32);
	JLabel title = new JLabel("two dice game");
	JLabel playerLabel1 = new JLabel("the players roll is: ");
	JLabel comLabel1 = new JLabel("the computers roll is: ");
	JLabel result = new JLabel(" ");
	JTextField pRoll = new JTextField(4);
	JTextField cRoll = new JTextField(4);
	JButton button = new JButton("Click to play");

	public TwoDiceGUI()
	{
		super("two dice game");
		setBounds(450, 450, 300, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		setResizable(false);


		title.setFont(mainFont);
		result.setFont(mainFont);
		button.setBackground(Color.BLACK);
		button.setBackground(Color.WHITE);

		add(title);
		add(playerLabel1);
		add(pRoll);
		add(comLabel1);
		add(cRoll);
		add(button);
		add(result);

		button.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		Die playerDie = new Die();
		Die comDie = new Die();
		String outcome;

		//calculation phase
		if(playerDie.getDieValue() > comDie.getDieValue())
		{
			outcome = "the player wins";
		}
		else if(playerDie.getDieValue() < comDie.getDieValue())
		{
			outcome = "the com has won";
		}
		else
		{
			outcome = "we hava a tie";
		}

		pRoll.setText("" + playerDie.getDieValue());
		cRoll.setText("" + comDie.getDieValue());
		result.setText(outcome);
		button.setText("Play again?");

	}

	public static void main(String[] args)
	{
		TwoDiceGUI frame = new TwoDiceGUI();
	}


}