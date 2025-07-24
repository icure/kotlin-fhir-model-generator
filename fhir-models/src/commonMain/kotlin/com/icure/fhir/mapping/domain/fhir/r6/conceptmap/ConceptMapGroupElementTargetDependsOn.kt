//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.conceptmap

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Other properties required for this mapping
 *
 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the
 * specified data attribute can be resolved, and it has the specified value.
 *
 * @param id Unique id for inter-element referencing
 * @param attribute A reference to a mapping attribute defined in ConceptMap.additionalAttribute
 * @param valueCode Value of the referenced data element
 * @param valueCoding Value of the referenced data element
 * @param valueString Value of the referenced data element
 * @param valueBoolean Value of the referenced data element
 * @param valueQuantity Value of the referenced data element
 * @param valueSet The mapping depends on a data element with a value from this value set
 */
@SerialName("ConceptMapGroupElementTargetDependsOn")
@Serializable
public data class ConceptMapGroupElementTargetDependsOn(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A reference to a mapping attribute defined in ConceptMap.additionalAttribute
   */
  public val attribute: String? = null,
  /**
   * Value of the referenced data element
   */
  public val valueCode: String? = null,
  /**
   * Value of the referenced data element
   */
  public val valueCoding: Coding? = null,
  /**
   * Value of the referenced data element
   */
  public val valueString: String? = null,
  /**
   * Value of the referenced data element
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of the referenced data element
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The mapping depends on a data element with a value from this value set
   */
  public val valueSet: String? = null,
) : BackboneElement
