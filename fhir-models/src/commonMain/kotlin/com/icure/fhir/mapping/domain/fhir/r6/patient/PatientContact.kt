//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.patient

import com.icure.fhir.mapping.domain.fhir.r6.address.Address
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A contact party (e.g. guardian, partner, friend) for the patient
 *
 * A contact party (e.g. guardian, partner, friend) for the patient.
 *
 * @param id Unique id for inter-element referencing
 * @param name A name associated with the contact person
 * @param address Address for the contact person
 * @param gender male | female | other | unknown
 * @param organization Organization that is associated with the contact
 * @param period The period during which this contact person or organization is valid to be
 * contacted relating to this patient
 */
@SerialName("PatientContact")
@Serializable
public data class PatientContact(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val relationship: List<CodeableConcept> = emptyList(),
  /**
   * A name associated with the contact person
   */
  public val name: HumanName? = null,
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * Address for the contact person
   */
  public val address: Address? = null,
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * Organization that is associated with the contact
   */
  public val organization: Reference? = null,
  /**
   * The period during which this contact person or organization is valid to be contacted relating
   * to this patient
   */
  public val period: Period? = null,
) : BackboneElement
