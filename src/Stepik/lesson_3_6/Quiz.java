package Stepik.lesson_3_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

public class Quiz {
    private final static ArrayList<Question> qSet = new ArrayList<>();
    private static int score;
    private static int num = 0;

    public static void main(String[] args) {
        qSet.add(new Question("Из какого фильма Прекрасный принц?"
                , new String[]{"Золушка", "Русалочка", "Спящая красавица", "Мулан"}, (byte) 1));
        qSet.add(new Question("Из какой страны родом Джастин Бибер?"
                , new String[]{"Канада", "США", "Франция", "Англия"}, (byte) 1));
        qSet.add(new Question("Что является национальным животным Шотландии?"
                , new String[]{"Единорог", "Волк", "Лошадь", "Корова"}, (byte) 1));
        qSet.add(new Question("Какая страна производит больше всего кофе в мире?"
                , new String[]{"Бразилия", "Индонезия", "Колумбия", "Вьетнам"}, (byte) 1));
        qSet.add(new Question("В какой стране находится Прага?"
                , new String[]{"Чехия"
                , "Англия"
                , "Бразилия"
                , "Франция"}, (byte) 1));
        qSet.add(new Question("Какой вкус у Куантро?"
                , new String[]{"Апельсина", "Базилика", "Лимона", "Ванили"}, (byte) 1));
        qSet.add(new Question("Какой безалкогольный напиток первым был взят в космос?"
                , new String[]{"Кока-Кола", "Фанта", "Пепси", "Снапл"}, (byte) 1));
        qSet.add(new Question("Сколько весит костюм Чубакки?"
                , new String[]{"3.6 кг", "7.7 кг", "2.7 кг", "6.8 кг"}, (byte) 1));
        qSet.add(new Question("Что означает термин “пиано”?"
                , new String[]{"В мягком темпе", "В бодром темпе", "В умеренно медленном темпе", "В быстром темпе"}, (byte) 1));
        qSet.add(new Question("Из чего сделан самый крепкий дом в “Трех поросятах”?"
                , new String[]{"Кирпич", "Солома", "Ветки", "Бамбук"}, (byte) 1));
        qSet.add(new Question("За какую страну играл Дэвид Бекхэм?"
                , new String[]{"Англия", "Бразилия", "США", "Испания"}, (byte) 1));
        new MainFrame("Quiz", 800, 400, new QuizGUI());
    }

    public static void addScore() {
        score++;
    }

    public static int getScore() {
        return score;
    }

    public static Question getQuestion() {
        return qSet.get(num);
    }

    public static void addNum() {
        num++;
    }

    public static int getNum() {
        return num + 1;
    }

    public static int getQAmount() {
        return qSet.size();
    }
}

class QuizGUI extends JPanel {
    static JLabel counter = new JLabel();
    static JLabel question = new JLabel();
    static JPanel topPanel = new JPanel();
    static JPanel questionPanel = new JPanel();
    static JPanel bottomPanel = new JPanel();
    static JPanel gameEndPanel = new JPanel();
    static JLabel gameEndLabel = new JLabel();
    static ArrayList<Button> buttons = new ArrayList<>();

    public QuizGUI() {
        setBackground(Color.WHITE);
        BoxLayout topPanelLayout = new BoxLayout(topPanel, BoxLayout.LINE_AXIS);
        topPanel.setLayout(topPanelLayout);

        counter.setFont(new Font(null, Font.BOLD, 16));
        counter.setText("Вопрос 1 из " + Quiz.getQAmount());
        counter.setFocusable(false);
        topPanel.add(Box.createHorizontalGlue());
        topPanel.setBackground(Color.WHITE);
        topPanel.add(counter);
        topPanel.add(Box.createRigidArea(new Dimension(20, 0)));

        GridLayout questionPanelLayout = new GridLayout(1, 1);
        questionPanel.setLayout(questionPanelLayout);
        questionPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        questionPanel.setBackground(Color.WHITE);

        question.setText(Quiz.getQuestion().question);
        question.setFocusable(false);
        question.setFont(new Font(null, Font.BOLD, 16));
        question.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        question.setHorizontalAlignment(SwingConstants.CENTER);
        question.setVerticalAlignment(SwingConstants.CENTER);

        question.setBackground(Color.WHITE);
        questionPanel.add(question);

        GridLayout buttonGrid = new GridLayout(2, 2);
        bottomPanel.setLayout(buttonGrid);
        bottomPanel.setBackground(Color.WHITE);
        getButtons();

        BoxLayout mainLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        setLayout(mainLayout);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(topPanel);
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(questionPanel);
        add(bottomPanel);
        add(Box.createRigidArea(new Dimension(0, 5)));

        GridLayout gameEndLayout = new GridLayout(1, 1);
        gameEndPanel.setLayout(gameEndLayout);
        gameEndPanel.setVisible(false);
        gameEndPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        gameEndLabel.setFont(new Font(null, Font.BOLD, 16));
        gameEndLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        gameEndLabel.setHorizontalAlignment(SwingConstants.CENTER);

        gameEndPanel.add(gameEndLabel);
        add(gameEndPanel);
    }

    public static void getButtons() {
        for (String ans : Quiz.getQuestion().giveAnswersInRandom()) {
            Button b = new Button(ans);
            b.setFont(new Font(null, Font.BOLD, 16));
            b.setActionCommand(ans);
            b.addActionListener(new ButtonActHandlerQuiz());
            b.setBackground(Color.LIGHT_GRAY);
            buttons.add(b);
            JPanel panel = new JPanel();
            BoxLayout box = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
            panel.setLayout(box);
            panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            panel.setBackground(Color.WHITE);
            panel.add(b);
            bottomPanel.add(panel);
        }
    }
}

class Question {
    String question;
    String[] answers;
    byte correctAnswer;

    public Question(String question, String[] answers, byte correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String[] giveAnswersInRandom() {
        HashSet<Integer> usedPositions = new HashSet<>();
        String[] answersFinal = new String[answers.length];
        for (int i = 0; i < answers.length; ) {
            int r = (int) (Math.random() * 4);
            if (!usedPositions.contains(r)) {
                answersFinal[r] = answers[i];
                usedPositions.add(r);
                i++;
            }
        }
        return answersFinal;
    }

    public boolean checkAnswer(String attempt) {
        return attempt.equals(answers[correctAnswer - 1]);
    }
}

class ButtonActHandlerQuiz implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (Quiz.getQuestion().checkAnswer(e.getActionCommand())) Quiz.addScore();
        System.out.println(Quiz.getScore());
        if (Quiz.getNum() < Quiz.getQAmount()) {
            Quiz.addNum();
            QuizGUI.counter.setText("Вопрос " + Quiz.getNum() + " из " + Quiz.getQAmount());
            QuizGUI.question.setText(Quiz.getQuestion().question);
            String[] ans = Quiz.getQuestion().giveAnswersInRandom();
            for (int i = 0; i < 4; i++) {
                Button b = (Button) QuizGUI.buttons.toArray()[i];
                b.setLabel(ans[i]);
                b.setActionCommand(ans[i]);
            }
        } else {
            QuizGUI.topPanel.setVisible(false);
            QuizGUI.questionPanel.setVisible(false);
            QuizGUI.bottomPanel.setVisible(false);
            QuizGUI.gameEndPanel.setVisible(true);
            QuizGUI.gameEndLabel.setText("Ваш результат: " + Quiz.getScore() + " из " + Quiz.getQAmount());
        }
    }
}