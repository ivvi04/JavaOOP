# ��������-��������������� ���������������� (��������)

## ���� 1. �������� ���: ������������, ������������, �����������

**[�������](https://github.com/ivvi04/JavaOOP/tree/master/src/main/java/ru/lakeevda/lesson1)**

����� ������� 3 ���� ������ � �����.
� ���� ���� ����� ������ ���� 2 ��������: ������� �������� �� ����� � ��������� ����

1. ������� ����. ��� �������� ��������� ����� (� ������������). ���������� � ������ ��� �����������. �� ������ ���� �������������� �������.
2. ��������� ����. �� �� �����, ��� � �������, �� ��� ������ ������������ �������� � ������� 1% �� ����� ������.
3. ���������� ����. �� �� �����, ��� � �������, �� ������ ������� ������ ����, ��� ��� � ����. (����� ����� �������� ����� �����).

## ���� 2. �������� ��� ���������� � ����������. ������ ��������������

**[�������](https://github.com/ivvi04/JavaOOP/tree/master/src/main/java/ru/lakeevda/lesson2)**

1. ������� ���������.
2. ������� ����������� �����, ����������� ����� ������� ����� ������.
3. ��������������� �� ������������ ������ ����� ��������, ������� ������� �� ������� �����.
4. ������� �����, ������ � ���������� � �������� �� �������� �� � ����� �����������.

## ���� 3. ��������� ����������� ���������� Java � ������� �� �������������

**[�������](https://github.com/ivvi04/JavaOOP/tree/master/src/main/java/ru/lakeevda/lesson3)**

������� ����� Employee c ������:
1. ���
2. �������
3. ��������

������� ����� Company � �������� ����������� (�������� � ������������).

����������:
1. ����������� ��������� Comparable � ������ Employee, ������� ���������� ����������� �� �������� (�� �����������).
2. ����������� ��������� �������-Comparator`��,
   ������� ���������� �� �������� �� ����������� � ��������: EmployeeSalaryComparator, EmployeeSalaryReversedComparator.
3. � ������ Company ����������� Iterable<Employee>, ������� ��������� �������� foreach ���� �� ��������.

   <code>Employee[] employees = ...
   Company company = new Company(employees);
   for (Employee e: company) {
   // ...
   }</code>

���. �������: ���������� ����������� ����������� � ���� ������-���������.

## ���� 4. ���: ���������. �1

**[�������](https://github.com/ivvi04/JavaOOP/tree/master/src/main/java/ru/lakeevda/lesson4)**

����������� ����� Box c �������������:
1. ����� ������ ���� ��������������� ����� �������. �� ���� Box<String> - ���������.
2. ������ ���� ����� add, ����������� ���������� ����� (��� ��� ������, ������� ���������� � �������)
3. � ������ ���������� ����� getWeight - ���������� ����� ���� �������.
4. ����� moveTo ���������� ���������� ������� ������� � ������.

## ���� 5. �� �������� � ��������

**[�������](https://github.com/ivvi04/JavaOOP/tree/master/src/main/java/ru/lakeevda/lesson5)**

 ����������� � �������������� ������, ��������� � ������ ������.

 ����� ����� ����������, ����������:
 1. ������� maven-������ (File -> new -> project -> Maven project)
 2. ���������� � pom.xml ����������� �� junit https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0
 3. ������� ����� HomeworkTest � ���������� src/test/java � ��� �� ������

 � �������� �� �������� 2 ������: Homework � HomeworkTest (��� ������ �� Github-������, ��� ��� ������ ���������).

 ���������� ����� �����.
 �������������� ��������� ��������:
 1. ������ ������ (����� ���������� 0)
 2. ������ �� ������

    <code>public int sum(List<Integer> ints) {
       // FIXME �����������
       return 0;
    }</code>

 ���������, ��� ������ �������� ������ 1 �������.
 �������������� ��������:
 1. ������ �������� ���� ������� � �� ��������� � item
 2. ������ �������� ���� ������� � �� �� ��������� � item
 3. ������ �������� ��������� ���������, ����� ������� ���� item
 4. ������ ������

    <code>public boolean hasExactly(List<String> items, String item) {
       // FIXME �����������
       return false;
    }</code>

 ������ �� �����������**
 ������������ �� source � target ��� ��������
 �������������� ��������:
 1. ��� ������ �� ������
 2. ������ ������ ������, ������ ���
 3. ������ ������ ������, ������ ���
 4. ��� ������ ������

    <code>public <T> void copy(List<? extends T> source, List<? super T> target) {
       // FIXME �����������
    }</code>

## ���� 6. ��� ������ � Solid

**[�������](https://github.com/ivvi04/JavaOOP/tree/master/src/main/java/ru/lakeevda/lesson6)**

����� �������� - ��������� ��������� ���������.

����� �������������� ���������� �������, ������� ����� ����������� ������ ��� ���������.

1. ������������ PDF-����� (������������ ����� ���� ��������� ����� �������� PDF-�����).
2. ������������ JSON-����� � ������ ���������
3. ������������ XML-����� � ������ ���������
4. ... ������������ ���� ������� ����� �����������

����� ���������� ������ ���� 2 �������:
1. ��������� ������ �������� ��������� ������ ���� ������?
2. ��� ����� ��������� ������, ���� � ��� ����� 1000+ ����� �������?

<code>public class ReportEntrypoint {
  /* ��������� �������� � ��� ������. ������� ���� ����� � ���������� ������. */
  public Report create(Document document, String reportType) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}</code>

<code>static class Document {
  private UUID id;
  private String number;
  // ...
}</code>

<code>static class Report {
  private byte[] data;
}</code>