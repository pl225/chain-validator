package com.company;

public class Root {

    private int number;
    private Root left;
    private Root right;

    // yanivi@personetics.com

    public Root (int number, Root left, Root right) {
        this.number = number;
        this.left = left;
        this.right = right;
    }

    public static void traversal (Root root) {

        Root current = root;

        while (current.left != null || current.right != null) {
            System.out.println(current.number);

            if (current.left != null) {
                if (current.right != null) {
                    Root change = current.left;

                    while (change.left != null) {
                        change = change.left;
                    }

                    change.left = current.right;
                    current.right = null;
                }
                current = current.left;
            }
        }

        System.out.println(current.number);
    }

    public static void main(String[] args) {
        Root tree = new Root(
        3,
                new Root(
                5,
                        new Root(
                            7,
                            null,
                            null
                        ),
                        new Root(
                        9,
                                new Root(
                                4,
                                null,
                                null
                                ),
                                null
                        )
                ),
                new Root(
                        6,
                        null,
                        new Root(
                            1,
                                null,
                                null
                        )
                )
        );

        Root.traversal(tree);
    }

}
