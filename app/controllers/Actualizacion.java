package controllers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import models.Recurso;

public class Actualizacion implements List<Actualizacion> {
		Recurso recurso;
		List<Recurso> actualizacion;
		@Override
		public int size() {
			return 0;
		}
		@Override
		public boolean isEmpty() {
			return false;
		}
		@Override
		public boolean contains(Object o) {
			return false;
		}
		@Override
		public Iterator<Actualizacion> iterator() {
			return null;
		}
		@Override
		public Object[] toArray() {
			return null;
		}
		@Override
		public <T> T[] toArray(T[] a) {
			return null;
		}
		@Override
		public boolean add(Actualizacion e) {
			return false;
		}
		@Override
		public boolean remove(Object o) {
			return false;
		}
		@Override
		public boolean containsAll(Collection<?> c) {

			return false;
		}
		@Override
		public boolean addAll(Collection<? extends Actualizacion> c) {

			return false;
		}
		@Override
		public boolean addAll(int index, Collection<? extends Actualizacion> c) {

			return false;
		}
		@Override
		public boolean removeAll(Collection<?> c) {

			return false;
		}
		@Override
		public boolean retainAll(Collection<?> c) {

			return false;
		}
		@Override
		public void clear() {

			
		}
		@Override
		public Actualizacion get(int index) {

			return null;
		}
		@Override
		public Actualizacion set(int index, Actualizacion element) {

			return null;
		}
		@Override
		public void add(int index, Actualizacion element) {

			
		}
		@Override
		public Actualizacion remove(int index) {

			return null;
		}
		@Override
		public int indexOf(Object o) {

			return 0;
		}
		@Override
		public int lastIndexOf(Object o) {

			return 0;
		}
		@Override
		public ListIterator<Actualizacion> listIterator() {

			return null;
		}
		@Override
		public ListIterator<Actualizacion> listIterator(int index) {

			return null;
		}
		@Override
		public List<Actualizacion> subList(int fromIndex, int toIndex) {

			return null;
		}

		public Recurso getRecurso() {

			return this.recurso;
		}		

		public List<Recurso> getActualizacion() {

			return this.actualizacion;
		}			
		
		public Recurso getActualizacion(int index) {

			return this.actualizacion.get(index);
		}		

		public int getActualizacionSize() {

			return this.actualizacion.size();
		}
		

		
		
		
}
