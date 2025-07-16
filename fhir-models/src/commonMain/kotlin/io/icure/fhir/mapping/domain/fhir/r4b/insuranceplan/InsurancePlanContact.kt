//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r4b.address.Address
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.humanname.HumanName
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contact for the product
 *
 * The contact for the health insurance product for a certain purpose.
 *
 * @param id Unique id for inter-element referencing
 * @param purpose The type of contact
 * @param name A name associated with the contact
 * @param address Visiting or postal addresses for the contact
 */
@SerialName("InsurancePlanContact")
@Serializable
public data class InsurancePlanContact(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of contact
   */
  public val purpose: CodeableConcept? = null,
  /**
   * A name associated with the contact
   */
  public val name: HumanName? = null,
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * Visiting or postal addresses for the contact
   */
  public val address: Address? = null,
) : BackboneElement
