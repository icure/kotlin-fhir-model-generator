//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproduct

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An operation applied to the product, for manufacturing or adminsitrative purpose
 *
 * An operation applied to the product, for manufacturing or adminsitrative purpose.
 *
 * @param id Unique id for inter-element referencing
 * @param operationType The type of manufacturing operation
 * @param authorisationReferenceNumber Regulatory authorization reference number
 * @param effectiveDate Regulatory authorization date
 * @param confidentialityIndicator To indicate if this proces is commercially confidential
 * @param regulator A regulator which oversees the operation
 */
@SerialName("MedicinalProductManufacturingBusinessOperation")
@Serializable
public data class MedicinalProductManufacturingBusinessOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of manufacturing operation
   */
  public val operationType: CodeableConcept? = null,
  /**
   * Regulatory authorization reference number
   */
  public val authorisationReferenceNumber: Identifier? = null,
  /**
   * Regulatory authorization date
   */
  public val effectiveDate: String? = null,
  /**
   * To indicate if this proces is commercially confidential
   */
  public val confidentialityIndicator: CodeableConcept? = null,
  public val manufacturer: List<Reference> = emptyList(),
  /**
   * A regulator which oversees the operation
   */
  public val regulator: Reference? = null,
) : BackboneElement
