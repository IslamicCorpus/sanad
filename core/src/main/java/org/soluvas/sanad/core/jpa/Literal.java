package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * A representation of the model object '<em><b>Literal</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class Literal {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String languageTag = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String adoc = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String html = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "literal_id") })
	private Set<SpellingProperty> spellings = new HashSet<SpellingProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Normalized text. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(unique = true)
	private String normalized = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Numeronym of the text, in order to improve privacy during query. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String numeronym = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id()
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Type(type = "org.hibernate.type.PostgresUUIDType")
	private UUID id = null;

	/**
	 * Returns the value of '<em><b>languageTag</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>languageTag</b></em>' feature
	 * @generated
	 */
	public String getLanguageTag() {
		return languageTag;
	}

	/**
	 * Sets the '{@link Literal#getLanguageTag() <em>languageTag</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLanguageTag
	 *            the new value of the '{@link Literal#getLanguageTag()
	 *            languageTag}' feature.
	 * @generated
	 */
	public void setLanguageTag(String newLanguageTag) {
		languageTag = newLanguageTag;
	}

	/**
	 * Returns the value of '<em><b>adoc</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>adoc</b></em>' feature
	 * @generated
	 */
	public String getAdoc() {
		return adoc;
	}

	/**
	 * Sets the '{@link Literal#getAdoc() <em>adoc</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @param newAdoc
	 *            the new value of the '{@link Literal#getAdoc() adoc}' feature.
	 * @generated
	 */
	public void setAdoc(String newAdoc) {
		adoc = newAdoc;
	}

	/**
	 * Returns the value of '<em><b>html</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>html</b></em>' feature
	 * @generated
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Sets the '{@link Literal#getHtml() <em>html</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @param newHtml
	 *            the new value of the '{@link Literal#getHtml() html}' feature.
	 * @generated
	 */
	public void setHtml(String newHtml) {
		html = newHtml;
	}

	/**
	 * Returns the value of '<em><b>spellings</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>spellings</b></em>' feature
	 * @generated
	 */
	public Set<SpellingProperty> getSpellings() {
		return spellings;
	}

	/**
	 * Adds to the <em>spellings</em> feature.
	 *
	 * @param spellingsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToSpellings(SpellingProperty spellingsValue) {
		if (!spellings.contains(spellingsValue)) {
			boolean result = spellings.add(spellingsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>spellings</em> feature.
	 *
	 * @param spellingsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromSpellings(SpellingProperty spellingsValue) {
		if (spellings.contains(spellingsValue)) {
			boolean result = spellings.remove(spellingsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>spellings</em> feature.
	 * 
	 * @generated
	 */
	public void clearSpellings() {
		while (!spellings.isEmpty()) {
			removeFromSpellings(spellings.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Literal#getSpellings() <em>spellings</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSpellings
	 *            the new value of the '{@link Literal#getSpellings() spellings}
	 *            ' feature.
	 * @generated
	 */
	public void setSpellings(Set<SpellingProperty> newSpellings) {
		spellings = newSpellings;
	}

	/**
	 * Returns the value of '<em><b>normalized</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Normalized text. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>normalized</b></em>' feature
	 * @generated
	 */
	public String getNormalized() {
		return normalized;
	}

	/**
	 * Sets the '{@link Literal#getNormalized() <em>normalized</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Normalized text. <!-- end-model-doc -->
	 * 
	 * @param newNormalized
	 *            the new value of the '{@link Literal#getNormalized()
	 *            normalized}' feature.
	 * @generated
	 */
	public void setNormalized(String newNormalized) {
		normalized = newNormalized;
	}

	/**
	 * Returns the value of '<em><b>numeronym</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Numeronym of the text, in order to improve privacy during query. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>numeronym</b></em>' feature
	 * @generated
	 */
	public String getNumeronym() {
		return numeronym;
	}

	/**
	 * Sets the '{@link Literal#getNumeronym() <em>numeronym</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Numeronym of the text, in order to improve privacy during query. <!--
	 * end-model-doc -->
	 * 
	 * @param newNumeronym
	 *            the new value of the '{@link Literal#getNumeronym() numeronym}
	 *            ' feature.
	 * @generated
	 */
	public void setNumeronym(String newNumeronym) {
		numeronym = newNumeronym;
	}

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets the '{@link Literal#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link Literal#getId() id}' feature.
	 * @generated
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Literal " + " [id: " + getId() + "]" + " [normalized: "
				+ getNormalized() + "]" + " [numeronym: " + getNumeronym()
				+ "]" + " [languageTag: " + getLanguageTag() + "]" + " [adoc: "
				+ getAdoc() + "]" + " [html: " + getHtml() + "]";
	}
}
