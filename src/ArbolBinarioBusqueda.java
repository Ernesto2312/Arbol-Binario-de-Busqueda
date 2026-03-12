 public class ArbolBinarioBusqueda<E extends Comparable<E>> {

        NodoBinario<E> root;

        public ArbolBinarioBusqueda(E info) {
            root = new NodoBinario<>(info, null);
        }

        public NodoBinario<E> getRoot() {
            return root;
        }

        public boolean isEmpty() {
            return root == null;
        }

        public boolean isRoot(NodoBinario<E> nodo) {
            return nodo == root;
        }

        public boolean isLeaf(NodoBinario<E> nodo) {
            return nodo.left == null && nodo.right == null;
        }

        public boolean isInternal(NodoBinario<E> nodo) {
            return nodo.left != null || nodo.right != null;
        }

        public void add(E info) {

            if (root == null) {
                root = new NodoBinario<>(info, null);
            } else {
                addRecursivo(info, root);
            }
        }

        private void addRecursivo(E info, NodoBinario<E> actual) {

            int comp = info.compareTo(actual.info);

            if (comp == 0) {
                System.out.println("No se permiten duplicados");
                return;
            }

            if (comp < 0) {

                if (actual.left == null)
                    actual.left = new NodoBinario<>(info, actual);
                else
                    addRecursivo(info, actual.left);

            } else {

                if (actual.right == null)
                    actual.right = new NodoBinario<>(info, actual);
                else
                    addRecursivo(info, actual.right);
            }
        }

        public NodoBinario<E> buscarIterativo(E info) {

            NodoBinario<E> cursor = root;

            while (cursor != null && !cursor.info.equals(info)) {

                if (info.compareTo(cursor.info) < 0)
                    cursor = cursor.left;
                else
                    cursor = cursor.right;
            }

            return cursor;
        }

        public void remove(E info) {
            root = deleteNode(info, root);
        }

        private NodoBinario<E> deleteNode(E info, NodoBinario<E> cursor) {

            if (cursor == null)
                return null;

            int comp = info.compareTo(cursor.info);

            if (comp < 0)
                cursor.left = deleteNode(info, cursor.left);

            else if (comp > 0)
                cursor.right = deleteNode(info, cursor.right);

            else {

                if (cursor.left == null)
                    return cursor.right;

                if (cursor.right == null)
                    return cursor.left;

                NodoBinario<E> sucesor = min(cursor.right);

                cursor.info = sucesor.info;

                cursor.right = deleteNode(sucesor.info, cursor.right);
            }

            return cursor;
        }

        private NodoBinario<E> min(NodoBinario<E> nodo) {

            while (nodo.left != null)
                nodo = nodo.left;

            return nodo;
        }

        public boolean modificar(E nuevaInfo, E info) {

            NodoBinario<E> nodo = buscarIterativo(info);

            if (nodo == null) {
                System.out.println("Elemento no encontrado");
                return false;
            }

            remove(info);
            add(nuevaInfo);

            return true;
        }
 }