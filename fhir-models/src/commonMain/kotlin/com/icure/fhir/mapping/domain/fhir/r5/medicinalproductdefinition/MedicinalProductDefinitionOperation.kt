//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A manufacturing or administrative process for the medicinal product
 *
 * A manufacturing or administrative process or step associated with (or performed on) the medicinal
 * product.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of manufacturing operation e.g. manufacturing itself, re-packaging
 * @param effectiveDate Date range of applicability
 * @param confidentialityIndicator Specifies whether this process is considered proprietary or
 * confidential
 */
@SerialName("MedicinalProductDefinitionOperation")
@Serializable
public data class MedicinalProductDefinitionOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of manufacturing operation e.g. manufacturing itself, re-packaging
   */
  public val type: CodeableReference? = null,
  /**
   * Date range of applicability
   */
  public val effectiveDate: Period? = null,
  public val organization: List<Reference> = emptyList(),
  /**
   * Specifies whether this process is considered proprietary or confidential
   */
  public val confidentialityIndicator: CodeableConcept? = null,
) : BackboneElement
