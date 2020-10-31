package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     */
    private String seriesnuber;
    private String name;
    private String surname;
    private String patronymic;
    private String middlename;
    private String birthday;
    private String dateofissue;
    private String govag;
            
        
            
     /* 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     */           
     /* +3. Создайте все необходимые конструкторы класса.
     */
        public Passport(String seriesnuber, String name, String surname, String patronymic, String birthday, String dateofissue, String govag) {
        this.seriesnuber = seriesnuber;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.dateofissue = dateofissue;
        this.govag = govag;
    }
      public Passport(String seriesnuber, String name, String surname, String middlename, String birthday, String govag) {
        this.seriesnuber = seriesnuber;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.birthday = birthday;
        this.govag = govag;
    }
       
    
     /* 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public String getSeriesnuber() {
        return seriesnuber;
    }

    public void setSeriesnuber(String seriesnuber) {
        this.seriesnuber = seriesnuber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(String dateofissue) {
        this.dateofissue = dateofissue;
    }

    public String getGovag() {
        return govag;
    }

    public void setGovag(String govag) {
        this.govag = govag;
    }

  




}
