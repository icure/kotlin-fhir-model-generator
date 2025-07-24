//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductauthorization

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The regulatory procedure for granting or amending a marketing authorization
 *
 * The regulatory procedure for granting or amending a marketing authorization.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Identifier for this procedure
 * @param type Type of procedure
 * @param datePeriod Date of procedure
 * @param dateDateTime Date of procedure
 */
@SerialName("MedicinalProductAuthorizationProcedure")
@Serializable
public data class MedicinalProductAuthorizationProcedure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifier for this procedure
   */
  public val identifier: Identifier? = null,
  /**
   * Type of procedure
   */
  public val type: CodeableConcept,
  /**
   * Date of procedure
   */
  public val datePeriod: Period? = null,
  /**
   * Date of procedure
   */
  public val dateDateTime: String? = null,
  public val application: List<MedicinalProductAuthorizationProcedure> = emptyList(),
) : BackboneElement
